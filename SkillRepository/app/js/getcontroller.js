app.controller('getctrl', getctrl);

        function getctrl($scope, $http) {    	
        	$scope.home = "This is the skill display page for admin";
            $scope.getRequest = function () {
                $http.get("http://localhost:7070/employeeSkills/") // TODO Move this value to configuration and provide only relative path
                    .then (function successCallback (response) {
                        $scope.empSkills = response.data;
                        console.log ("Response from microservice :: ", response.data);
                    }, function errorCallback(response){
                        console.log("Unable to perform GET request");
                    });
            }            
            $scope.getRequest();
        }       
            