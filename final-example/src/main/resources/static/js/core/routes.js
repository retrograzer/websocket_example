angular.
  module('app').
  config(['$routeProvider', 'baseRoute',
    function config($routeProvider, baseRoute) {

      $routeProvider.
      	when('/chat', {
          
          templateUrl: baseRoute + "chat/template.html",
          controller: 'ChatController',
          controllerAs: 'ctrl'
          
        }).
        otherwise('/chat');
    }
  ]);