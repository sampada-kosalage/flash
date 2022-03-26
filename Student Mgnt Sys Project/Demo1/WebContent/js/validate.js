function validate()
{
	var s="";
	var ok;
	var elements = document.getElementById("risform").elements;
	for (var i = 0; i < elements.length; i++) {
	   //s=s+check(elements[i].name,elements[i].value)
	   s=s+"\n"+elements[i].name+":"+elements[i].value;
	}
	if (confirm(s+"\n\nPlease Confirm")) return true;
	else return false;
}
function check(n,v)
{
	//put all field validations here
	var s="";
	switch(n)
	{
		//Location
		case "location_id": s=s+"\n"+n+":"+v;break;
		case "location_name": s=s+"\n"+n+":"+v;break;
		case "address": s=s+"\n"+n+":"+v;break;
		case "contact": s=s+"\n"+n+":"+v;break;
		case "phone": s=s+"\n"+n+":"+v;break;
		//Room
		case "room_id": s=s+"\n"+n+":"+v;break;
		case "location_id": s=s+"\n"+n+":"+v;break;
		case "room_name": s=s+"\n"+n+":"+v;break;
		case "desc": s=s+"\n"+n+":"+v;break;
		case "type": s=s+"\n"+n+":"+v;break;
		case "capacity": s=s+"\n"+n+":"+v;break;
		case "cost": s=s+"\n"+n+":"+v;break;
		case "no_of_computer": s=s+"\n"+n+":"+v;break;
		case "internet_service_available": s=s+"\n"+n+":"+v;break;
		case "network_distribution": s=s+"\n"+n+":"+v;break;
		case "no_of_printers": s=s+"\n"+n+":"+v;break;
		//Course
		case "course_id": s=s+"\n"+n+":"+v;break;
		case "course_name": s=s+"\n"+n+":"+v;break;
		case "descr": s=s+"\n"+n+":"+v;break;
		case "subjects": s=s+"\n"+n+":"+v;break;
		case "topics": s=s+"\n"+n+":"+v;break;
		//Faculty
		case "faculty_id": s=s+"\n"+n+":"+v;break;
		case "faculty_name": s=s+"\n"+n+":"+v;break;
		case "phone": s=s+"\n"+n+":"+v;break;
		case "email": s=s+"\n"+n+":"+v;break;
		case "desc": s=s+"\n"+n+":"+v;break;
		case "location_id": s=s+"\n"+n+":"+v;break;
		case "type": s=s+"\n"+n+":"+v;break;
		case "cost": s=s+"\n"+n+":"+v;break;
		//Batch
		case "batch_id": s=s+"\n"+n+":"+v;break;
		case "batch_code": s=s+"\n"+n+":"+v;break;
		case "descr": s=s+"\n"+n+":"+v;break;
		case "start_date": s=s+"\n"+n+":"+v;break;
		case "end_date": s=s+"\n"+n+":"+v;break;
		case "course_id": s=s+"\n"+n+":"+v;break;
		case "location_id": s=s+"\n"+n+":"+v;break;
		case "batch_timing": s=s+"\n"+n+":"+v;break;
		case "no_of_student": s=s+"\n"+n+":"+v;break;
		//Schedule
		case "schedule_id": s=s+"\n"+n+":"+v;break;
		case "from_date": s=s+"\n"+n+":"+v;break;
		case "to_date": s=s+"\n"+n+":"+v;break;
		case "from_time": s=s+"\n"+n+":"+v;break;
		case "to_time": s=s+"\n"+n+":"+v;break;
		case "course_id": s=s+"\n"+n+":"+v;break;
		case "batch_id": s=s+"\n"+n+":"+v;break;
		case "room_id": s=s+"\n"+n+":"+v;break;
		case "faculty_id": s=s+"\n"+n+":"+v;break;
		//User
		case "user_id": s=s+"\n"+n+":"+v;break;
		case "user_name": s=s+"\n"+n+":"+v;break;
		case "user_type": s=s+"\n"+n+":"+v;break;
		case "login": s=s+"\n"+n+":"+v;break;
		case "password": s=s+"\n"+n+":"+v;break;
		case "location_id": s=s+"\n"+n+":"+v;break;
		case "role": s=s+"\n"+n+":"+v;break;
		case "start_date": s=s+"\n"+n+":"+v;break;
		case "end_date": s=s+"\n"+n+":"+v;break;
		default: s=s+"\ndefault";break;
	}
	return(s);
}
