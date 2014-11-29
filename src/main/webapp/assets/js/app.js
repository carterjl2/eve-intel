var app = angular.module('eveintel', ['ngRoute', 'ui.bootstrap']).config(function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: 'root.html'
    }).otherwise({
        redirectTo: '/'
    });
});

app.directive('graphDoughnut', function () {
    return {
        restrict: 'E',
        scope: {
            data: '='
        },
        link: function (scope, element, attrs) {
            var chart = $('<div class="graph graph-doughnut"></div>').appendTo(element);
            $.each(attrs.$attr, function (i, v) {
                if (v != 'data') {
                    $(chart).attr(v, attrs[v]);
                }
            });
            scope.$watch('data', function (newValue, oldValue) {
                if (newValue) {
                    $(chart).children().remove();
                    Morris.Donut({
                        element: chart,
                        data: scope.data,
                        resize: true
                    });
                }
            }, false);

        }
    }
});

app.directive('graphLine', function ($filter) {
    return {
        restrict: 'E',
        scope: {
            data: '='
        },
        link: function (scope, element, attrs) {
            var chart = $('<div class="graph graph-line"></div>').appendTo(element);
            $.each(attrs.$attr, function (i, v) {
                if (v != 'data') {
                    $(chart).attr(v, attrs[v]);
                }
            });
            scope.$watch('data', function (newValue, oldValue) {
                if (newValue) {
                    $(chart).children().remove();
                    Morris.Line({
                        element: chart,
                        data: scope.data.data,
                        xkey: 'x',
                        ykeys: ['y'],
                        labels: [scope.data.title],
                        dateFormat: function (x) {
                            return $filter('date')(x);
                        }
                    });
                }
            }, false);

        }
    }
});

app.directive('scrollOnTrue', function ($log) {
    return {
        restrict: 'A',
        link: function (scope, element, attributes) {
            console.log(scope.scrollOnTrue);
            var id = 'scroll';
            $(element).attr('id', id);
            scope.$watch(attributes.scrollOnTrue, function (newValue) {
                console.log(newValue);
                if (newValue) {
                    $log.debug("scrolling");
                    $("body").animate({scrollTop: element.offset().top}, "slow");
                }
            });
        }
    }
});