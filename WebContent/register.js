/**
 * 
 */

$(document).ready(function() {
	console.log("=========== Registartion Page 2 =========");
	$(".hotel_details").css('display','none');
	$('.user_type').click(function() {
		console.log($(this).is(':checked')+"--"+($(this).attr('id')=="type_manager")+" --- "+($(this).is(':checked') && ($(this).attr('id')=="type_manager")));
		if($(this).is(':checked') && ($(this).attr('id')=="type_manager")){
			console.log("In manager click");
			$(".hotel_details").css('display',"table-row");
		}else if($(this).is(':checked') && ($(this).attr('id')=="type_customer")){
			console.log("in customer clicked");
			$(".hotel_details").css('display',"none");
		}
	})
});