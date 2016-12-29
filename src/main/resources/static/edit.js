function qs2obj() {
	var obj = {};
	location.search.slice(1).split('&').forEach(function(param) {
		var p = param.split('=');
		obj[p[0]] = decodeURIComponent(p[1]);
		return obj;
	})
	
	return obj
}
$(function() {
	
	var qs = qs2obj();
	$('#caseid').val(qs.cid);
	console.log(qs.cid);
	
	$("#save").click(function(){
		 console.log($('#caseid').val());
		 var tmp = $('#caseid').val();
		 
		 
		 	$.ajax({
		 		method: 'POST',
		 		url: '/springboot/saveCase',
		 		data: {age:tmp},
		 		type: 'json'
		 	}).done(function(data) {
		 	}).fail(function(data) {
		 	})
 	
 	});
	
	

	

	
})
	
	