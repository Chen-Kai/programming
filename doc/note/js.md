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