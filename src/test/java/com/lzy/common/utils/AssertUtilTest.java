package com.lzy.common.utils;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AssertUtilTest {

	/**
	 * 	方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */
	@Test
	public void testIsTrue() {
//		String aa = "123";
//		String bb = "123";
//		AssertUtil.isTrue(aa.equals(bb), "密码不相等");
		String aa = "123";
		String bb = "23";
		AssertUtil.isTrue(aa.equals(bb), "密码不相等");
	}

	/**
	 * 	方法2：断言为假，如果为真，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */
	@Test
	public void testIsFalse() {
//		AssertUtil.isFalse(2 > 1 , "这个条件是真的");
		AssertUtil.isFalse(2 - 1 == 9  , "这个条件是真的");
	}

	/**
	 *方法3：断言对象不为空，如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */
	
	@Test
	public void testNotNull() {
//		AssertUtil.notNull("", "对象没有数据");
//		AssertUtil.notNull(null, "对象没有数据");
		AssertUtil.notNull("二位固体废物", "对象没有数据");
	}
	/**
	//方法4：断言对象必须空，如果不为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */

	@Test
	public void testIsNull() {
//		AssertUtil.isNull("", "对象存在数据");
		AssertUtil.isNull(null, "对象存在数据");
//		AssertUtil.isNull("二位固体废物", "对象存在数据");
	}

	/**
	 * 	//方法5：断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */
	@Test
	public void testNotEmptyCollectionOfQString() {
		List list = new ArrayList();
		list.add("aeritg");
		AssertUtil.notEmpty(list, "集合为空");
	}

	/**
	//方法6：断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */
	@Test
	public void testNotEmptyMapOfQQString() {
		Map map = new HashMap();
		map.put("1", 1);
		AssertUtil.notEmpty(map, "map集合为空");
	}
	/**
	//方法7：断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */

	@Test
	public void testHasText() {
		String str = "  1  ";
		AssertUtil.hasText(str, "字符串没有数据");
	}

	/**
	//方法8：断言值必须大于0，如果小于或等于0，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
	 * @param condition
	 * @param message
	 */
	@Test
	public void testGreaterThanZero() {
		BigDecimal b = new BigDecimal(1.2);
		AssertUtil.greaterThanZero(b, "小于0");
//		BigDecimal b = new BigDecimal(0.1);
//		AssertUtil.greaterThanZero(b, "小于0");
//		BigDecimal b = new BigDecimal(0);
//		AssertUtil.greaterThanZero(b, "小于0");
//		BigDecimal b = new BigDecimal(-5);
//		AssertUtil.greaterThanZero(b, "小于0");
	}

}
