var serviceM= angular.module('servicesM', ['ngResource']);

serviceM.factory('UserService', ['$resource', function($resource){
	return $resource('/user');
}])