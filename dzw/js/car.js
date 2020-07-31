export default {
	find(data,success,error){
		$.ajax({
			url:"http://localhost:8888/wsbcar",
			data:data,
			success:function(result){
				success(result);
			},
			error:function(e){
				error(e);
			}
		});
	},
	exportExcel(){
		window.location.href="http://localhost:8888/exportExcel"
	}
	
}
