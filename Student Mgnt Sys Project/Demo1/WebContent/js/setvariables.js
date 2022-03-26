function disablemenu()
{
	document.oncontextmenu = document.body.oncontextmenu = function() {return false;}
}
function clearvalues()
{
	document.getElementById("setvariables").action="clearvariables";
	document.getElementById("setvariables").submit();
}
function filtervalues()
{
	location.reload();
}