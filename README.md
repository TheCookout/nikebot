# How to log in Nike web|snkrs protocol login|snkrs bot

## how to login nike|snkrs login|snkrs app|snkrs crack|snkrs agreement order|nike agreement order|qq:80258153



**Contact information**: ->QQ WeChat same number: 80258153



​ As we all know, how to log in to the Nike web terminal by protocol requires the following parts, _abck, bmsz;

Of course, you can also say sensor-data;

Of course, there are also x-kpsdk-ct and x-kpsdk-cd that were added in 4.3; then we will say item by item;

1. Log in by abck and bmsz, don't talk nonsense, we will directly get the effect;

[![gYQoSx.png](https://z3.ax1x.com/2021/05/09/gYQoSx.png)](https://imgtu.com/i/gYQoSx)

​ There will be several problems here, namely; abck, bmsz, and x-kpsdk-ct, x-kpsdk-cd

Due to the overlap with the previous post, let’s talk about the generation principle of abck and bmsz in detail;

1. First of all, the purpose of abck and bmsz is basically a series of processes from login to order placement. Both of these values ​​will be involved; that is, commonly known as the end shield, here we mainly discuss how he can pass.

step

a. Visit any address to get abck, bmsz;

b. Verify the corresponding sensor through staticweb's GET, POST, and POST requests

c. After verification, it is available.



So when discussing how the sensor is generated, in fact, we can easily see that the sensor is actually the js of the staticweb get request;

Then you will find here that actually there are a lot of fingerprints involved here, that is, a lot of fingerprint information;

Then the problem derives 2 problems;

1. How to simulate a correct sensor, and how to simulate multiple sensors;

-----

Let me first talk about how to simulate the first sensor. There are N methods for this. Let me first talk about the one that looks the most lowB;

That is, you only need to de-obfuscate this js. You can basically get a more readable one, and then execute it in the browser environment;

Of course, it is involved here, he must verify the sensor twice, and the generation of the second sensor requires the content of the first sensor;

We can execute it twice in the broswer environment;

2. Tired of writing. And it's a bit off topic, let's go back to logging in.

3. First, we can grab a logged-in data packet;

[![gYlJhR.png](https://z3.ax1x.com/2021/05/09/gYlJhR.png)](https://imgtu.com/i/gYlJhR)



We can clearly see that he has N cookies and headers, which is very annoying;

Through repeated tests, we can confirm that there are basically only four items that need attention, abck, bmsz, x-kpsdk-ct, x-kpsdk-cd

The previous abck and bmsz will cause 403 problems

The following x-kpsdk-ct, x-kpsdk-cd will cause 429 problems;



Process:

When we are ready for these four items, we only need to simulate the data package to log in;



Contact: ->QQ WeChat same number: 80258153



**Previous articles:**

"Nike app protocol login|how to login nike app"

"How to break the 429 problem|how to create x-kpsdk-ct x-kpsdk-cd"

"How to create akamai|how to create akamai sensor data"

"Nike web protocol login|how to login nike web"



Show results:

[![gY3awD.png](https://z3.ax1x.com/2021/05/09/gY3awD.png)](https://imgtu.com/i/gY3awD)
[![gY3dTe.png](https://z3.ax1x.com/2021/05/09/gY3dTe.png)](https://imgtu.com/i/gY3dTe)
[![gY3UeO.png](https://z3.ax1x.com/2021/05/09/gY3UeO.png)](https://imgtu.com/i/gY3UeO)





