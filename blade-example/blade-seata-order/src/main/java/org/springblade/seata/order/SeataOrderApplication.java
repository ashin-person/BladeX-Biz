/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.seata.order;

import org.springblade.common.constant.LauncherConstant;
import org.springblade.core.cloud.feign.EnableBladeFeign;
import org.springblade.core.launch.BladeApplication;
import org.springblade.core.transaction.annotation.SeataCloudApplication;

/**
 * Order启动器
 *
 * @author Chill
 */
@EnableBladeFeign
@SeataCloudApplication
public class SeataOrderApplication {

	public static void main(String[] args) {
		BladeApplication.run(LauncherConstant.APPLICATION_SEATA_ORDER_NAME, SeataOrderApplication.class, args);
	}

}

