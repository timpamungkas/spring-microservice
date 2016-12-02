(function() {
    'use strict';
    angular
        .module('gatewayApp')
        .factory('Employee', Employee);

    Employee.$inject = ['$resource', 'DateUtils'];

    function Employee ($resource, DateUtils) {
        var resourceUrl =  'employee/' + 'api/employees/:id';

        return $resource(resourceUrl, {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    if (data) {
                        data = angular.fromJson(data);
                        data.birthDate = DateUtils.convertLocalDateFromServer(data.birthDate);
                    }
                    return data;
                }
            },
            'update': {
                method: 'PUT',
                transformRequest: function (data) {
                    var copy = angular.copy(data);
                    copy.birthDate = DateUtils.convertLocalDateToServer(copy.birthDate);
                    return angular.toJson(copy);
                }
            },
            'save': {
                method: 'POST',
                transformRequest: function (data) {
                    var copy = angular.copy(data);
                    copy.birthDate = DateUtils.convertLocalDateToServer(copy.birthDate);
                    return angular.toJson(copy);
                }
            }
        });
    }
})();
