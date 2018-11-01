$(document).ready(function() {
    setH();
});
    //浏览器窗口大小变化时
$(window).resize(function() {
    setH();
});
// 设置body高度
function setH () {
    var h=$(window).height();
    var height;
    if(h<946){
        height=946;
    }else{
        height=h;
    };
    $('#body').height(height+'px');
};