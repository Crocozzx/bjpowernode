<%--
  Created by IntelliJ IDEA.
  User: zhangzhixuan
  Date: 2022/7/21
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <script src="js/jquery.js"></script>
  <script>
      $(function () {
          $.getJSON(
                "CountryServlet",
                function (data) {
                    var str = "";
                    for (var i = 0;i< data.length;i++){
                       str+="<option value='"+data[i].id+"'>"+data[i].name+"</option>";
                    }
                    $("#select1").empty()
                    $("#select1").html("<option value=\"0\">--请选择--</option>")
                    $("#select1").html($("#select1").html()+str)
                }
          )
          $("#select1").change(function () {
              $.getJSON(
                      "CityServlet",
                      {"id":$(":selected").val()},
                      function (data) {
                          var str1 = "";
                          if (data.length>0){//当上个选中是请选择时，这个也应该时请选择，当不是请选择时，这里也没有请选择，而是默认一个城市
                            //如果后端的list没有数据就是list.size=0，所以转换成json[{}]的数组长度也是0
                             for (var i1 = 0 ; i1 < data.length; i1++){
                               str1 += "<option value='"+data[i1].id+"'>"+data[i1].name+"</option>";
                             }
                             $("#select2").empty();
                             $("#select2").html(str1)
                          }else {
                             $("#select2").html("<option value=\"0\">--请选择--</option>")
                          }
                      }
              )
          })
      })
  </script>
  <body>
  国家:
  <select name="country" id="select1">
      <option value="0">--请选择--</option>
  </select>
<%--  当我们这个城市的表应该是根据select1的改变而去异步请求--%>
  城市:<select name="city" id="select2">
    <option value="0">--请选择--</option>
  </select>
  </body>
</html>
