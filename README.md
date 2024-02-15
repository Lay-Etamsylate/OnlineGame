### 基于手势控制的在线人机交互游戏系统设计与实现

#### 软件/系统主要功能
该系统是一种创新型的人机交互系统，用户除注册登录等常规功能外，还能利用先进的手势识别技术，通过手势来控制游戏的进行。该系统能够实时地检测和解析用户的手势动作，然后将这些手势动作转换成游戏中的指令。系统管理员支持常规用户管理、游戏管理等功能。

#### 关键技术/改进点/实验设计
关键技术：手势识别、MediaPipe
改进点：足够轻量，可以直接运行在浏览器中
实验设计：
①手势识别模块：这是系统的核心部分，负责实时捕捉和解析用户的手势。该模块包含一个网络摄像头，以及对应的图像处理和机器学习算法，用于从捕捉到的数据中识别出特定的手势。
②游戏逻辑模块：该模块负责处理通过手势识别模块得到的指令，将其转化为游戏中的动作或操作；该模块通过设计一套规则，定义各种手势对应的游戏操作。
③用户界面模块：该模块用于显示游戏的状态，以及接收用户的输入；该模块直观地反映游戏的状态，以及简洁有效地显示游戏信息。