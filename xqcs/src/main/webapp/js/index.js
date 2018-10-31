$(document).ready(function() {

	$(window).scroll(function(e){
		var winHeight = $(window).scrollTop();
		// console.log(winHeight)
		if(winHeight>76){
			$('.nav-bar').addClass('scroll');
		}else{
			$('.nav-bar').removeClass('scroll');
		};
		// //显示隐藏回到顶部
		// if(winHeight>900){

		// }else{

		// }
	})
});