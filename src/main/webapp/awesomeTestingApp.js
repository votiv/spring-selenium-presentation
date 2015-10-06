/**
 * Created by viskyo on 02/10/2015.
 */
'use strict';
var awesomeTesting = angular.module("awesomeTesting", [

    'ngRoute'
]);

awesomeTesting.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {

    $routeProvider
        .when('/home', {
            templateUrl: 'tiles/tiles.html',
            controller: 'HomeController'
        })
        .otherwise({
            redirectTo: '/home'
        });
}]);