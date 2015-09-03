var nowM= angular.module('nowM', ['ngRoute', 'controllersM', 'servicesM', 'directiveM']);

nowM.config(function($resourceProvider) {
  	$resourceProvider.defaults.stripTrailingSlashes = false;
});

nowM.config(['$routeProvider',function($routeProvider){
	$routeProvider.when('/home', {
		templateUrl: 'html/home.html',
		controller: 'HomeController'
	});
	$routeProvider.when('/aboutUs', {
		templateUrl: 'html/aboutUs.html',
		controller: 'AboutUsController'
	});
	$routeProvider.when('/contactUs', {
		templateUrl: 'html/contactUs.html',
		controller: 'ContactUsController'
	});

	$routeProvider.when('/profile', {
		templateUrl: 'html/profile.html',
		controller: 'ProfileController'
	});
	$routeProvider.when('/logout', {
		templateUrl: 'html/home.html',
		controller: 'ProfileController'
	});
	$routeProvider.when('/login', {
		templateUrl: 'html/login.html',
		controller: 'ProfileController'
	});
	$routeProvider.when('/register', {
		templateUrl: 'html/register.html',
		controller: 'ProfileController'
	});
	
	$routeProvider.otherwise({
        redirectTo: '/home'
	});
}]);
