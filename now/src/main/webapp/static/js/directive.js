var directiveM= angular.module('directiveM', []);

directiveM.directive('banner', function(){
  	return {
  		restrict: 'E',
  		templateUrl: 'html/directive/banner.html',
	    scope: {
	      	bannerData: '='
	    },
	    controller: function($scope) {
	      	$scope.selectTab = function(tab) {
		        angular.forEach($scope.bannerData.navData.mainNavData, function(tab){
		          tab.active = false;
		        });
		        angular.forEach($scope.bannerData.navData.configNavData, function(tab){
		          tab.active = false;
		        });		        
		        tab.active = true;
	      	};
	      	$scope.selectHome = function() {
		        angular.forEach($scope.bannerData.navData.mainNavData, function(tab){
		          tab.active = false;
		        });
		        angular.forEach($scope.bannerData.navData.configNavData, function(tab){
		          tab.active = false;
		        });		        
		        $scope.bannerData.navData.mainNavData[0].active = true;
	      	};	      	
	    },
	    link: function(scope, element, attrs, controllers){
	    	//console.log("scope: "+scope.bannerData);
	    }
  	};
});