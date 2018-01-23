
function  addRaw() {

    var temp = jQuery('#rawform').serialize();

    jQuery.post("addRawtobacco.do",temp,function (data) {

        var  t = eval('('+data+')');
        alert(t.msg);

    });


}