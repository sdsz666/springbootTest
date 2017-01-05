function qs2obj() {
	var obj = {};
	location.search.slice(1).split('&').forEach(function(param) {
		var p = param.split('=');
		obj[p[0]] = decodeURIComponent(p[1]);
		return obj;
	})
	
	return obj
}

	function getCookie(name)
		{
		var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
		if(arr=document.cookie.match(reg))
		return unescape(arr[2]);
		else
		return null;
		}

		
		
$(function() {
	var qs = qs2obj();
	//$('#caseid').val(qs.cid);
	console.log(qs.cid);
	
	//get请求 获取case信息  放到对应位置
	$.get('/caseManage/getCaseByCaseId?caseId='+qs.cid,function(data){
		
		$('#userId').val(data.userId);
		$('#caseId').val(data.caseId);
		$('#caseDescription').val(data.caseDescription);
		$('#modelDescription').val(data.modelDescription);
		$('#templateId').val(data.templateId);
		$('#templateName').val(data.templateName);
		$('#sceneId').val(data.sceneId);
		$('#sceneDescription').val(data.sceneDescription);
		$('#extraInputList').val(data.extraInputList);
		$('#checkPoinDescription').val(data.checkPoinDescription);
		$('#extraCheckList').val(data.extraCheckList);
		$('#defaultCheckType').val(data.defaultCheckType);	
		
	});
	
	
	
	
	$("#save").click(function(){
		 console.log($('#caseid').val());
		 var tmp = $('#caseid').val();
		 
		 
		 	$.ajax({
		 		type: 'POST',
		 		contentType: "application/json; charset=utf-8",
		 		url: '/springboot/saveCase',
		 	
		 		data: JSON.stringify({"age":tmp}),
		 		dataType : 'json'
		 	}).done(function(data) {
		 		 alert("success" + data.id);
		 	}).fail(function(data) {
		 		alert("fail")
		 	})
 	
 	});
	
	
	var user = JSON.parse(localStorage.user) || {uid: 0};
	$('#curUserId').html(user.uid);
	

	
})
	
	