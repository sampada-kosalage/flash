
function ajax(url)
{
	 if(window.XMLHttpRequest){
		 request=new XMLHttpRequest();
	 }
	 else if(window.ActiveXobject){
		 request=new ActiveXobject("Microsoft.XMLHTTP");
	 }  
	 try{
		 request.onreadystatechange=getinfo;
		 request.open("GET",url,true);
		 request.send();
	 }catch(e){
		 alert("unable to connect");
	 }
}
function getinfo(){
	  if(request.readyState==4){
		  document.getElementById(at).innerHTML=request.responseText;
	  }
  }
