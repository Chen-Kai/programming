ECMA
DOM - document
BOM - window
parseInt()
isNaN()
arguments

currentStyle
getComputedStyle

childNodes
nodeType
children
parentNode	// 直接parent
offsetParent	// 和定位相关的parent
nextSibling
nextElementSibling
firstChild
firstElementChild

对象
 - 方法 
 - 属性 
 
给数组类添加新的方法
        Array.prototype.sum = function () {
            var sum = 0;
            for (var i = 0; i < this.length; i++) {
                sum += this[i];
            }
            return sum;
        };

setArribute
className

var oLi = document.createElement('li');
oUl.appendChild(oLi);
insertBefore
removeChild
<a href="javascript:;">link</a>

document.createDocumentFragment()

tHead
tBodies
rows
cells
tFoot

String.search
String.split

form - 向服务器提交数据

onsubmit
onreset


filter: alpha(opacity: 30);

opacity: 0.3;

Math.ceil(1.1)

jQuery
$(document).ready(function () {
	// DOM loaded
    $('div.poem-stanza').addClass('highlight');
});

addClass
removeClass

divs[i].className += '<空格>highlight';


html:
	内容
	样式：告诉浏览器怎么做、如何显示

CSS：控制样式和布局

CSS：
	选择符
	属性赋值

id：某个元素

class：某类元素

h5
<script>
window.document.designmode = "on";
</script>

<section> 划分网页
border-radius: 5px
box-shadow:2px 3px 5px #666, 2px 3px 5px #258 inset;
box-shadow: X轴偏移量 Y轴偏移量 [阴影模糊半径] [阴影扩展半径] [阴影颜色] [投影方式];
background: rgba(255, 255, 255, 0.5);
background-image: linear-gradient(to top left, #0f0, #00f);
   
text-overflow:ellipsis; overflow:hidden; white-space:nowrap; 
text-shadow: 2px 2px 2px green;
background: url(x.png) no-repeat;  background-size:100%;

                for (var i = 0, len = imgs.length; i < len; i++) {
                    (function (i) {
                        imgs[i].onmouseover = function () {
                            reset();
                            for (var j = 1; j <= i; j++) {
                                imgs[j].style.left = parseInt(imgs[j].style.left) - tr + "px";
                                console.log(j + ", " + imgs[j].style.left);
                            }
                        };
                        imgs[i].onmouseexit = function () {
                            reset();
                        };
                    })(i);
                }

关键字
break	delete	function 	return 	typeof
case	do	if	switch	var
catch	else	in	this	void
continue	false	instanceof	throw	while
debugger	finally	new	true	with
default	for	null	try

class	const	enum export extends import super

implements let private public yield
interface package protected static

arguments eval

arguments encodeURI Infinity Number RegExp
Array encodeURIComponent isFinite Object String
Boolean Error isNaN parseFloat SyntaxError
Date eval JSON parseInt TypeError
decodeURI EvalError Math RangeError undefined
decodeURIComponent Function NaN ReferenceError URIError

变量是一个值得名称，可以通过名称类获得对值的引用。

JS对象：
	- 普通对象：是“名值对”的无序集合。
	- 数组：带编号的值的有序集合。
	- 函数：具有可可执行代码的对象

面向对象：数据本身可以定义方法来操作值

不区分浮点数和整数

-2<sup>23</sup> ~ 2<sup>23</sup>

010 // 8
0x10 // 16

1.1d23 // 1.1 * 10<sup>23</sup>

JS UTF-16

a = "\u0030"

Number("3");
String(false);
Boolean([]);
Object(3);

parsetInt("10000000000", 2); // 1024

在函数内声明的变量在函数体内始终是可见的，而且覆盖全局变量。

声明一个全局变量，实际上是定义了全局对象的一个属性。

var golbal = 1// 声明一个不可删除的全局变量
gg = 1 // 声明一个可删除的全局变量
delete golbal // return false;
delete gg // return true;

canvas // 画板

通过调用canvas提供的方法绘图
SVG通过构建一颗XML元素树来实现绘图

大部分绘制API都是在“绘制上下文”对象上定义的。

一旦定义了路径，fill等方法就可以在该路径上进行操作了。

要在画布上绘制线段以及填充这些线段的闭合区域，从定义一条路径开始。

beginPath() 定义一条新的路径

move() 定义一条新的子路径

canvas水平居中
            canvas {
                display: block;
                margin: 0 auto;
            }


stroke()和fill()方法都不改变当前路径。要开始一条新的路径，需要调用beginPath()。

sin 正弦 对边/斜边
cos 余弦 临边/斜边
tan 对边/临边

每个canvas只有一个上下文对象，换句话说，只有一个画笔。

<iframe src="./aaa.html" width="350" height="350" frameborder="0"></iframe>

[]
push
pop
shift
unshift
delete 相当于赋值undefined

document.images

画布API允许保存当前图形的状态，这样就可以再多个状态之间切换，之后也可以恢复。
调用save()将当前图形状态压入状态栈，调用restore()会从栈中弹出并恢复最近一次保存的状态。

translate()将坐标原点进行上下左右移动。
rotate()将坐标轴根据指定角度进行顺时针旋转。
scale()缩放X轴或Y轴


var w = window.innerWidth
|| document.documentElement.clientWidth
|| document.body.clientWidth;

var h = window.innerHeight
|| document.documentElement.clientHeight
|| document.body.clientHeight;

<style="border: dashed thin #00415e">

function eraseSquare() {
var canvas = document.getElementById(“canvas1”);
canvas.width = canvas.width;
}

. fillRect—For drawing a filled rectangle
. strokeRect—For drawing a rectangular outline
. clearRect—For making an empty, transparent rectangular shape


To draw other shapes in the <canvas> element you use lines or paths. The five
methods used to draw and use paths are
. beginPath()—This method creates the path in the canvas.
. closePath()—This method draws a straight line from the current point to
the start. It won’t do anything when paths are already closed or on paths
with only one point.
. stroke()—This draws an outline of your path.
. fill()—This fills in the shape of your path.
. moveTo()—This draws nothing, but moves the drawing position to a new
location on the canvas.

Always specify your starting position on your paths with a moveTo() command first.

    var img = new Image();
    img.src = "b.png";
    img.onload = function () {
        ctx.drawImage(img, 100, 100);
    };
	
进制转换：
parseInt("100").toString(2);

/\s/ 空白字符
\s 空白字符
\d 数字
\w 字符
\b 单词开端

        $(document).ready(
                function () {
				// 当前窗口大小
                    var w = $(window).width();
                    var h = $(window).height();
                    alert("w: " + w + ", h: " + h);
                }
        );
		

``` css
selector {
	property: value; 
	property: value; 
}
```

打包分组
h1,h2,h3,h4,h5,h6 {
  color: green;
  }

继承： 子元素继承父元素的属性

后代选择
li strong { // li下的strong标签
	font-style: italic;
	font-weight: normal;
}  

元素选择
html {
	color:black;
}
 
通配
* {
	color:white;
}

类选择 p && important类
p.important {
	color:red;
}

属性选择
[title]
{
color:red;
}

a[href]
{
color:red;
}

有href && 有title属性
a[href][title]
{
color:red;
}

a[href*="w3school.com.cn"]
{
color: red;
}

直接子元素
h1 > strong {color:red;}

相邻
h1 + p {margin-top:50px;}

:not(.cls)

$('#selected-plays li:not(.horizontal)').addClass('sub-level');

$('a[href^="mailto:"]').addClass('mailto');

$('a[href$=".pdf"]').addClass('pdflink');

 $('a[href^="http"][href*="henry"]').addClass('henrylink');

 $('tr:even').addClass('alt');
 
 $('div.horizontal:eq(1)')
 
 $('tr:nth-child(odd)').addClass('alt');
 
 $('td:contains(Henry)').addClass('highlight');
 
   $('a').filter(function() {
    return this.hostname && this.hostname != location.hostname;
  }).addClass('external');
  
  // 最近的同辈元素
  $('td:contains(Henry)').next().addClass('highlight');
  
  // 所有同辈的
    $('td:contains(Henry)').nextAll().addClass('highlight');

	.parent()方法在DOM中上溯一层
	
	.children()
	
	要访问jQuery对象引用的第
一个DOM元素，可以使用.get(0)。

var myTag = $('#my-element').get(0).tagName;
var myTag = $('#my-element')[0].tagName;

  $('div.chapter a').attr({
    rel: 'external',
    title: 'Learn more at Wikipedia'
  });
  
$(document).ready(function() {
  // Use attr() to add an id, rel, and title.
  $('div.chapter a[href*="wikipedia"]').attr({
    rel: 'external',
    title: function() {
      return 'Learn more about ' + $(this).text() + ' at Wikipedia.';
    },
    id: function(index, oldValue) {
      return 'wikilink-' + index;
    }
  });
});

HTML属性是指页面标记中放在引号中的值，而DOM属性则指通过JS能够取得的值。

在jQuery中，可以通过.prop()方法取得和设置DOM属性：
//取得"checked"属性的当前值
var currentlyChecked = $('.my-checkbox').prop('checked');
//设置"checked"属性的值
$('.my-checkbox').prop('checked', false);

//取得文本输入框的当前值
var inputValue = $('#my-input').val();
//取得选项列表的当前值
var selectValue = $('#my-select').val();
//设置单选列表的值
$('#my-single-select').val('value3');
//设置多选列表的值
$('#my-multi-select').val(['value1', 'value2']);

  // Add "back to top" links.
  $('<a href="#top">back to top</a>').insertAfter('div.chapter p');
  $('<a id="top"></a>').prependTo('body');
  bing
 在其他元素前、后插入新内容的一套
方案。
 .insertBefore()在现有元素外部、之前添加内容；
 .prependTo()在现有元素内部、之前添加内容；
 .appendTo()在现有元素内部、之后添加内容；
 .insertAfter()在现有元素外部、之后添加内容。

$.getJson("x.json");

定义类和使用对象
``` javascript
        var Light = function () {

        };

        Light.prototype.turnOn = function () {
            return "On";
        };

        Light.prototype.turnOff = function () {
            return "Off";
        };

        window.onload = function () {
            var light = new Light();
            alert(light.turnOn());
            alert(light.turnOff());
        };
```

或者：
``` javascript
        var Light = function () {
        };
        Light.prototype = {
            turnOn: function () {
                return "On";
            },
            turnOff: function() {
                return "Off";
            }
        };
```

alert
confirm
prompt
window.open() 打开一个网址


DOM：定义和访问HTML文档的标准方法。
DOM节点类型：
- 元素节点
- 文本节点
- 属性节点

ele.style.display = "none";

ele.className


