<%--
  Created by IntelliJ IDEA.
  User: zhangzhixuan
  Date: 2022/7/21
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.js"></script>
    <script>
        $(function () {
            $("#text1").keyup(function () {
                var val = $("#text1").val();
                var reg =  /^[\u4e00-\u9f5a]+$/;
                if (reg.test(val)){
                    $.getJSON(
                        "KeyUpServlet",
                        {"value":$("#text1").val()},
                        function (data) {
                            str = ""
                            for (var i = 0;i < data.length ; i++){
                                str = str+"<div>"+data[i].productname+"</div>"
                            }
                            $("#div").html(str)
                        }
                    )

                }
                $("#div").click(function (a) {
                    var t = a.target;
                    $("#text1").val($(t).html())
                    $("#div").html("")
                })

            })
        })
    </script>
</head>
<body>
    <input type="text" name="text1" id="text1" >
    <div id="div"></div>
</body>
</html>
