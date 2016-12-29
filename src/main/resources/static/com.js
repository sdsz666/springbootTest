
$(function() {
	$('#myTabs > li >a').on('click', function(ev) {
		ev.preventDefault();
		$.get("/springboot/getCaseInfo",function(data){
			console.log('catalog data: ', data);
			$("#home_table tbody").empty()
			$.each(data.caseModels, function(i,item){
				$("#home_table tbody").append('<tr><td>'+item.id+'</td><td>'+item.caseName+'</td><td><a href="/caseedit?cid='+item.id+'" >编辑</a></td></tr>');
			});
			
			
	    });
	    $(this).tab('show');	
	});
	$('#myTabs > li > a:first').click();
	
	
	
	
	
	
	
	$(document).on('click','#home_table tbody td button', function(ev) {
		var id = $(this).data('id');
//		location.href = "http://localhost:9091/hello/" + id;
		var url = "http://localhost:9091/hello/" + id;
		window.open(url);
	})
	


})


