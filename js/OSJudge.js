window.onload = function() {
    var height =document.getElementsByClassName('picture');
    var osVer;
    osVer = "Android";
    if(navigator.userAgent.indexOf(osVer)>0){
        alert(osVer);
        for (var i = 0; height.length; i++) {
            height[i].setAttribute("height","20%");
        }
    }
}