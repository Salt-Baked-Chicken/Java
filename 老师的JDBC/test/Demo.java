package com.qhit.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.qhit.dao.GoodsDao;
import com.qhit.dao.SoldDao;
import com.qhit.dao.impl.GoodsDaoImpl;
import com.qhit.dao.impl.SoldDaoImpl;
import com.qhit.pojo.Goods;
import com.qhit.pojo.Sold;

public class Demo {
	Scanner input = new Scanner(System.in);
	GoodsDao spd = new GoodsDaoImpl();// 商品Dao的对象
	SoldDao sd = new SoldDaoImpl();// 商品销售记录
	List<Goods> list = new ArrayList<Goods>();// 商店的集合

	public static void main(String[] args) {
		Demo d = new Demo();
		d.startShangPin();
	}

	/**
	 * 主界面的方法
	 */
	private void startShangPin() {
		while (true) {
			System.out.println("欢迎来到商品管理系统");
			System.out.println("1   新增商品信息");
			System.out.println("2   商品进货");
			System.out.println("3   销售商品");
			System.out.println("4   数据统计");
			System.out.println("5   退出功能");
			System.out.println("请选择");
			// 如果输入合法就赋值
			if (input.hasNextInt()) {
				// 使用switch选择1-2
				switch (input.nextInt()) {
				case 1:
					// 新增商品信息的方法
					addNew();
					break;
				case 2:
					// 进货的方法
					getGoods();
					break;
				case 3:
					// 销售商品的方法
					sellGoods();
					break;
				case 4:
					// 数据统计
					dataCount();
					break;
				case 5:
					// 退出系统
					System.out.println("是否真的要退出系统(y/其他)");
					if (input.next().charAt(0) == 'y') {
						System.out.println("退出成功");
						System.exit(0);
					}
					break;
				default:
					// 选择不正确
					System.out.println("你选择的选项不正确");
					break;
				}
			} else {
				// 输入不正确时,提示重新输入
				System.out.println("输入不正确,请重新输入");
				input.next();
			}
		}
	}

	/**
	 * 新增商品信息的方法
	 */
	private void addNew() {
		Goods sp = new Goods();
		System.out.println("请输入商品编号");
		sp.setId(input.nextInt());
		System.out.println("请输入商品名称");
		sp.setName(input.next());
		int count = spd.selectOneByName(sp.getName());
		if (count > 0) {
			System.out.println("商品已经存在，或商品名重复，请重新添加");
			return;
		}
		System.out.println("请输入商品价格");
		sp.setPrice(input.nextDouble());
		System.out.println("请输入商品描述");
		sp.setDescribe(input.next());
		// 如果这个方法返回的数大于0则表示成功,反之失败
		if (spd.insertShangPin(sp) > 0) {
			System.out.println("添加商品成功,是否继续添加(y/其他)");
			if (input.next().charAt(0) == 'y') {
				// 继续添加,直接调用此方法
				addNew();
			} else {
				System.out.println("输入任意键返回上级");
				input.next();
				// 返回上一级,调用上一级的方法
				startShangPin();
			}
		} else {
			System.out.println("添加失败,是否重新添加(y/其他)");
			// 添加如果要重新添加直接调用此方法
			if (input.next().charAt(0) == 'y') {
				addNew();
			} else {
				// 返回上一级,调用上一级的方法
				System.out.println("输入任意键返回上级");
				input.next();
				startShangPin();
			}
		}
	}

	/**
	 * 进货的方法
	 */
	private void getGoods() {
		// 进货之前首先输入商品的编号
		System.out.println("请输入你要进货的商品的编号或者名称");
		String str = input.next();
		Goods g = spd.selectOneByNameOrId(str);
		// 确定货物是否存在
		if (null == g) {
			System.out.println("你要进货的商品不存在，请重新进货");
			return;
		}
		System.out.println("你要进货的编号是" + g.getId() + ",名称为" + g.getName() + ",当前库存量为" + g.getNumber());
		System.out.println("请输入进货的数量");
		int count = input.nextInt();
		g.setNumber(g.getNumber() + count);
		int i = spd.updateShangPin(g);
		if (i > 0) {
			System.out.println("进货成功");
		} else {
			System.out.println("进货失败，请重新进货");
		}
	}

	/**
	 * 销售商品的方法
	 */
	private void sellGoods() {
		System.out.println("所有商品信息如下:");
		System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品库存量\t商品描述");
		// 用集合接收所有商品的信息,并用for循环遍历输出
		List<Goods> list = spd.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId() + "\t\t");
			System.out.print(list.get(i).getName() + "\t\t");
			System.out.print(list.get(i).getPrice() + "\t\t");
			System.out.print(list.get(i).getNumber() + "\t\t");
			System.out.print(list.get(i).getDescribe());
			System.out.println();
		}
		double sum = 0;
		List<Sold> soldList = new ArrayList<Sold>();
		List<Goods> goodsList = new ArrayList<Goods>();
		while (true) {
			System.out.println("请输入你想要销售的商品id或商品名");
			String str = input.next();
			Goods g = spd.selectOneByNameOrId(str);
			// 确定货物是否存在
			if (null == g) {
				System.out.println("你要销售的商品不存在，请重新选择");
				break;
			}
			System.out.println("你要销售的编号是" + g.getId() + ",名称为" + g.getName() + ",当前库存量为" + g.getNumber());
			System.out.println("请输入销售的数量");
			int count = input.nextInt();
			// 判断库存是否够
			if (count > g.getNumber()) {
				System.out.println("没有那么多库存，请重新销售");
				break;
			}
			g.setNumber(g.getNumber() - count);
			goodsList.add(g);
			Sold s = new Sold();
			s.setGoods_id(g.getId());
			s.setCount(count);
			s.setPrice(g.getPrice() * count);
			s.setTime(new Date());
			soldList.add(s);
			sum += s.getPrice();
			System.out.println("是否继续销售？（y/其他字符）");
			char choose = input.next().charAt(0);
			if (choose != 'y') {
				break;
			}
		}
		for (int i = 0; i < goodsList.size(); i++) {
			int soldCount = spd.updateShangPin(goodsList.get(i));
			if (soldCount <= 0) {
				System.out.println("销售失败，请重新销售");
			}
		}
		boolean counts = sd.sold(soldList);
		if (counts) {
			System.out.println("本次销售列表如下");
			for (int i = 0; i < soldList.size(); i++) {
				System.out.println("商品编号：" + soldList.get(i).getGoods_id() + ",销售数量" + soldList.get(i).getCount()
						+ ",销售总额为" + soldList.get(i).getPrice());
			}
		}
		System.out.println("本次销售总额为" + sum + "元");
	}

	/**
	 * 数据统计的方法
	 */
	private void dataCount() {
		System.out.println("1.查看所有商品信息\n2.查询库存为0的商品信息\n3.查看所有销售记录\n4.根据商品名称查询此商品销售记录\n5.查询指定时间范围内的销售总额\n6.返回上一级");
		if (input.hasNextInt()) {
			// 使用switch选择1-2
			switch (input.nextInt()) {
			case 1:
				// 查询所有商品信息
				selectGoods();
				break;
			case 2:
				// 查询库存为0的商品信息
				selectGoodsByCount();
				break;
			case 3:
				// 查看所有销售记录
				selectSolds();
				break;
			case 4:
				// 根据名称查询销售记录
				selectSoldsByName();
				break;
			case 5:
				// 根据时间查询销售总额
				selectSoldsByTime();
			case 6:
				// 返回上一级菜单
				break;
			default:
				// 选择不正确
				System.out.println("你选择的选项不正确");
				break;
			}
		} else {
			// 输入不正确时,提示重新输入
			System.out.println("输入不正确,请重新选择");
			input.next();
		}
	}

	/**
	 * 查询库存为0的商品信息
	 */
	private void selectGoodsByCount() {
		System.out.println("所有库存为0的商品信息如下:");
		System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品描述");
		// 用集合接收所有商品的信息,并用for循环遍历输出
		list = spd.selectAllByCount();
		if (list.size() <= 0) {
			System.out.println("没有0库存商品");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i).getId() + "\t\t");
				System.out.print(list.get(i).getName() + "\t\t");
				System.out.print(list.get(i).getPrice() + "\t\t");
				System.out.print(list.get(i).getDescribe());
				System.out.println();
			}
		}
		System.out.println("输入任意键返回主菜单");
		input.next();
	}

	/**
	 * 查询所有商品信息的方法
	 */
	private void selectGoods() {
		System.out.println("所有商品信息如下:");
		System.out.println("商品编号\t\t商品名称\t\t商品价格\t\t商品库存量\t商品描述");
		// 用集合接收所有商品的信息,并用for循环遍历输出
		List<Goods> list = spd.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId() + "\t\t");
			System.out.print(list.get(i).getName() + "\t\t");
			System.out.print(list.get(i).getPrice() + "\t\t");
			System.out.print(list.get(i).getNumber() + "\t\t");
			System.out.print(list.get(i).getDescribe());
			System.out.println();
		}
		System.out.println("输入任意键返回上级");
		input.next();
	}
	
	/**
	 * 查询所有销售记录的方法
	 */
	private void selectSolds() {
		System.out.println("所有销售记录信息如下:");
		System.out.println("销售记录编号\t\t商品id\t\t销售数量\t\t销售总价\t\t销售时间");
		// 用集合接收所有销售记录的信息,并用for循环遍历输出
		
		List<Sold> soldList =sd.selectAllSolds();
		for (int i = 0; i < soldList.size(); i++) {
			System.out.print(soldList.get(i).getId() + "\t\t\t");
			System.out.print(soldList.get(i).getGoods_id() + "\t\t");
			System.out.print(soldList.get(i).getCount() + "\t\t");
			System.out.print(soldList.get(i).getPrice() + "\t\t");
			System.out.print(soldList.get(i).getTime());
			System.out.println();
		}
		System.out.println("输入任意键返回上级");
		input.next();
	}
	
	/**
	 * 根据商品名称查询销售记录的方法
	 */
	private void selectSoldsByName() {
		System.out.println("请输入你想查询的商品名称");
		String name = input.next();
		Goods g = spd.selectOneByNameOrId(name);
		// 确定货物是否存在
		if (null == g) {
			System.out.println("你要销售的商品不存在，请重新选择");
			return;
		}
		System.out.println("该商品所有销售记录信息如下:");
		System.out.println("销售记录编号\t\t商品id\t\t销售数量\t\t销售总价\t\t销售时间");
		// 用集合接收所有销售记录的信息,并用for循环遍历输出
		
		List<Sold> soldList =sd.selectAllSoldByGoodsName(name);
		for (int i = 0; i < soldList.size(); i++) {
			System.out.print(soldList.get(i).getId() + "\t\t\t");
			System.out.print(soldList.get(i).getCount() + "\t\t");
			System.out.print(soldList.get(i).getPrice() + "\t\t");
			System.out.print(soldList.get(i).getTime());
			System.out.println();
		}
		System.out.println("输入任意键返回上级");
		input.next();
	}
	
	/**
	 * 根据时间计算销售总额
	 */
	@SuppressWarnings("deprecation")
	private void selectSoldsByTime() {
		DateFormat bf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("请输入你想查询开始时间");
		String startTime = input.next();
		System.out.println("请输入你想查询的结束时间");
		String endTime = input.next();
		double sum = 0 ;
		try {
            Date start = bf.parse(startTime);// df.parse(s);String转成对象
            Date end = bf.parse(endTime);// df.parse(s);String转成对象
            end.setDate(end.getDate()+1);
            sum = sd.selectSoldsByTime(start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }
		System.out.println("\n改时间段内的销售总额为"+sum+"元\n");
		System.out.println("输入任意键返回上级");
		input.next();
	}
}
