阻塞和非阻塞：阻塞和非阻塞是进程访问数据的时候，数据是否准备就绪的一种处理方式，当数据没有准备好的时候，
阻塞：往往需要等待缓冲区中的数据准备好后才处理其他的事情，否则一直等待在那里
非阻塞：当我们进程访问我们的数据缓冲区的时候，数据没有准备好的时候，直接返回，不需要等待数据有的时候，也直接返回。

同步和异步的方式：
同步和异步都是基于应用程序和操作系统处理IO时间锁的方式
同步：直接参与IO读写的操作，在处理IO事件时候，必须阻塞在某个方法上面等待IO事件完成（）
异步：所有的IO读写交给操作系统去处理

JAVA IO模型
BIO JDK1.4以前我们使用都是BIO 阻塞IO
阻塞到我们的读写方法，阻塞到线程来提供性能，对于线程的开销本来就是性能的浪费。
NIO：jdk1.4 linux 多路复用技术(select 模式) 实现IO事件的轮询
方式 同步非阻塞的模式
AIO


