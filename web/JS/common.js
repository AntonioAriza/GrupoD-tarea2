function test () {
    var marker;
    var latLng = new google.maps.LatLng(36.7195916, -4.425103700000022);
        var opciones = {
            center: latLng,
            zoom: 14,
            mapTypeId: google.maps.MapTypeId.HYBRID
        };
        var map = new google.maps.Map(document.getElementById('mapa'), opciones);
        var geocoder = new google.maps.Geocoder();
        var infowindow = new google.maps.InfoWindow();
        google.maps.event.addListener(map, 'click', function (event) {
            geocoder.geocode({
                'latLng': event.latLng
            }, function (results, status) {
                if (status == google.maps.GeocoderStatus.OK) {
                    if (results[0]) {
                        document.getElementById('direccion').innerHTML = '<br /><span style="color:#FF0099">' + results[0].formatted_address + '</span>';
                        document.getElementById('coordenadas').innerHTML = '<br /><span style="color:#FF0099">' + results[0].geometry.location + '</span>';
                        if (marker) {
                            marker.setPosition(event.latLng)
                        } else {
                            marker = new google.maps.Marker({
                                position: event.latLng,
                                map: map
                            })
                        }
                        infowindow.setContent(results[0].formatted_address + '<br/> Coordenadas: ' + results[0].geometry.location);
                        infowindow.open(map, marker)
                    } else {
                        document.getElementById('mensaje').innerHTML = 'No se encontraron resultados'
                    }
                } else {
                    document.getElementById('mensaje').innerHTML = 'Geocodificación  ha fallado debido a: ' + status
                }
            });
        });
}