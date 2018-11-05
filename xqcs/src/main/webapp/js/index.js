
$(document).ready(function() {
	setScroll();
	$(window).scroll(function(e){
		setScroll();

	});

	$('#submit').click(function(){
		var name=$('#name').val();
		var phone=$('#phone').val();
		var city=$('#city').val();
		var msg=$('#messages').val();
		if(isEmpty(name)){
			console.log('姓名不能为空');
			showMsg('姓名不能为空');
			return;
		};
		if(isEmpty(phone)){
			console.log('电话不能为空');
			showMsg('电话不能为空');
			return;
		};
		if(isEmpty(city)){
			console.log('地址不能为空');
			showMsg('地址不能为空');
			return;
		};
		$.ajax({
			type: "POST",
			url: "/pc/index",
			data: {name:name, phone:phone,city:city,message:msg},
			dataType: "json",
			success: function(data){
				showMsg('留言成功！');
				$('#name,#phone,#city,#messages').val('');   //清空input里面的所有内容
			},
			err:function(err){
				showMsg('留言失败，请检查网络后重试。');
				console.log(err);
			}
		});
	});
	if($('#txtbox')){
		$('#txtbox').myScroll({
			speed: 20, //数值越大，速度越慢
			rowHeight: 40 //li的高度
		});
	}
	
});

function setScroll(){
	var winHeight = $(window).scrollTop();
	if(winHeight>76){
		$('.nav-bar').addClass('scroll');
	}else{
		$('.nav-bar').removeClass('scroll');
	};
}

function isEmpty(txt){
	return txt.match(/^\s*$/);
};

function showMsg(msg){
	$('#msg').text(msg);
	$('#alert').fadeIn();
}

$('#cancel').click(function(){
	$('#alert').fadeOut();
});


