var request;
var at="SelectVenue";
function getvenuesforlocation() {
	  var url="getvenuesforlocation.jsp?location_id="+document.getElementById("location_id").value;
	  ajax(url);
}