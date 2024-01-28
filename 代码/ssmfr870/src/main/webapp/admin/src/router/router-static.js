import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import yiwanchengfuwu from '@/views/modules/yiwanchengfuwu/list'
    import fuwuchanpin from '@/views/modules/fuwuchanpin/list'
    import shipin from '@/views/modules/shipin/list'
    import storeup from '@/views/modules/storeup/list'
    import discussfuwuchanpin from '@/views/modules/discussfuwuchanpin/list'
    import fuwurenyuanyiwanchengshixiang from '@/views/modules/fuwurenyuanyiwanchengshixiang/list'
    import yonghutongzhi from '@/views/modules/yonghutongzhi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yonghutousu from '@/views/modules/yonghutousu/list'
    import fuwurenyuan from '@/views/modules/fuwurenyuan/list'
    import fuwuyuyue from '@/views/modules/fuwuyuyue/list'
    import chexiaotousu from '@/views/modules/chexiaotousu/list'
    import fuwutuiding from '@/views/modules/fuwutuiding/list'
    import news from '@/views/modules/news/list'
    import fuwuzhuangtai from '@/views/modules/fuwuzhuangtai/list'
    import fuwurenyuantongzhi from '@/views/modules/fuwurenyuantongzhi/list'
    import discusshuodong from '@/views/modules/discusshuodong/list'
    import fuwurenyuandaibanshixiang from '@/views/modules/fuwurenyuandaibanshixiang/list'
    import discussfuwurenyuantongzhi from '@/views/modules/discussfuwurenyuantongzhi/list'
    import discussshipin from '@/views/modules/discussshipin/list'
    import yonghudaibanshixiang from '@/views/modules/yonghudaibanshixiang/list'
    import daiwanchengfuwu from '@/views/modules/daiwanchengfuwu/list'
    import chat from '@/views/modules/chat/list'
    import huodong from '@/views/modules/huodong/list'
    import yonghuyiwanchengshixiang from '@/views/modules/yonghuyiwanchengshixiang/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/yiwanchengfuwu',
        name: '已完成服务',
        component: yiwanchengfuwu
      }
      ,{
	path: '/fuwuchanpin',
        name: '服务产品',
        component: fuwuchanpin
      }
      ,{
	path: '/shipin',
        name: '视频',
        component: shipin
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/discussfuwuchanpin',
        name: '服务产品评论',
        component: discussfuwuchanpin
      }
      ,{
	path: '/fuwurenyuanyiwanchengshixiang',
        name: '服务人员已完成事项',
        component: fuwurenyuanyiwanchengshixiang
      }
      ,{
	path: '/yonghutongzhi',
        name: '用户通知',
        component: yonghutongzhi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yonghutousu',
        name: '用户投诉',
        component: yonghutousu
      }
      ,{
	path: '/fuwurenyuan',
        name: '服务人员',
        component: fuwurenyuan
      }
      ,{
	path: '/fuwuyuyue',
        name: '服务预约',
        component: fuwuyuyue
      }
      ,{
	path: '/chexiaotousu',
        name: '撤销投诉',
        component: chexiaotousu
      }
      ,{
	path: '/fuwutuiding',
        name: '服务退订',
        component: fuwutuiding
      }
      ,{
	path: '/news',
        name: '养老资讯',
        component: news
      }
      ,{
	path: '/fuwuzhuangtai',
        name: '服务状态',
        component: fuwuzhuangtai
      }
      ,{
	path: '/fuwurenyuantongzhi',
        name: '服务人员通知',
        component: fuwurenyuantongzhi
      }
      ,{
	path: '/discusshuodong',
        name: '活动评论',
        component: discusshuodong
      }
      ,{
	path: '/fuwurenyuandaibanshixiang',
        name: '服务人员待办事项',
        component: fuwurenyuandaibanshixiang
      }
      ,{
	path: '/discussfuwurenyuantongzhi',
        name: '服务人员通知评论',
        component: discussfuwurenyuantongzhi
      }
      ,{
	path: '/discussshipin',
        name: '视频评论',
        component: discussshipin
      }
      ,{
	path: '/yonghudaibanshixiang',
        name: '用户待办事项',
        component: yonghudaibanshixiang
      }
      ,{
	path: '/daiwanchengfuwu',
        name: '待完成服务',
        component: daiwanchengfuwu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/huodong',
        name: '活动',
        component: huodong
      }
      ,{
	path: '/yonghuyiwanchengshixiang',
        name: '用户已完成事项',
        component: yonghuyiwanchengshixiang
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
