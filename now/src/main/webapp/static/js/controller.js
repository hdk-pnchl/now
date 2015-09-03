var controllersM= angular.module('controllersM', []);


controllersM.controller('CoreController', ['$scope', '$http', function($scope, $http){
}]);

controllersM.controller('BannerController', ['$scope', '$http', function($scope, $http){
	$http.get('/now/core/fetchBannerData').then(function(response){
    	$scope.bannerdata = response.data;
    	//alert($scope.bannerData.projectName)
  	}, function(response){
    	alert('something wrong with: /nowstatic/data/json/bannerData.json');
  	});	
}]);

controllersM.controller('HomeController', ['$scope', '$window', '$location', function($scope, $window, $location){
	//$window.location.href = '/Now/login';
	$location.path('/login')
}]);

controllersM.controller('AboutUsController', ['$scope', function($scope){
	
}]);


controllersM.controller('ContactUsController', ['$scope', function($scope){
	
}]);

controllersM.controller('ProfileController', ['$scope', function($scope){
	
}]);



