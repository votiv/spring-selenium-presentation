/**
 * Created by viskyo on 02/10/2015.
 */

var awesomeTesting = angular.module("awesomeTesting", [

    'ui.router'
])
    .config(['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {

        $urlRouterProvider.otherwise("/tiles")

        $stateProvider
            .state('tiles', {
                url: '/tiles',
                templateUrl: 'tiles.html'
            })
    }]);