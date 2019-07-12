/**
 *
 */
$(document).ready(

function(){
	$(".office_exist").on("change",
		function(){
			var officeExist = $("[name='office.officeExist.exist']:checked").val();

			if(officeExist=="true"){
				$("#officeInput").attr("disabled",false);
			}
			if(officeExist=="false"){
				$("#officeInput").attr("disabled",true).val("");
			}
		}
	)
}
);


