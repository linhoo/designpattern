/*
 * Copyright (C) 2015 YUNDA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tobby.designpattern.observer.sanguo.jdk;

/**
 * 此类描述的是：
 * 
 * @author 李林虎
 * @date 2015年10月21日 下午3:53:48
 */
public class Client {

	public static void main(String[] args) {
		QiGuo qiGuo = new QiGuo();
		ChuGuo chuGuo = new ChuGuo();
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(qiGuo);
		hanFeiZi.addObserver(chuGuo);
		hanFeiZi.haveBreakfast();
		hanFeiZi.haveFun();
	}

}