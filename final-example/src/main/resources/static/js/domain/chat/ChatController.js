/**
 * 
 */

angular.module('app').controller("ChatController", ["ChatService", "$scope", function(ChatService, $scope) {
	
	var ctrl = this;
	ctrl.number = 0;
	
	ChatService.dataStream.onMessage(function(message) {
	      ctrl.number = JSON.parse(message.data).number;
	      console.log(ctrl.number);
	      $scope.$apply();
	    });
		

	
	ctrl.increment = ChatService.increment;
	ctrl.close = ChatService.close;
	
}]);