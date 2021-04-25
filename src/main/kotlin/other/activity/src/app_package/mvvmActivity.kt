package other.activity.src.app_package



fun mvvmActivity(
        applicationPackage:String?,
        activityClass:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}.activity

import android.os.Bundle
import android.os.Message
import android.view.View
import com.kantai8.sports.R
import com.kantai8.sports.base.BaseActivity
import com.kantai8.sports.common.ttad.WeakHandler
import com.kantai8.sports.common.util.StatusBarUtil

class ${activityClass}Activity : BaseActivity(), WeakHandler.IHandler, View.OnClickListener {

   override fun getContentViewId(): Int {
        return R.layout.${layoutName}
    }
    

    override fun initActivity() {
        super.initActivity()
        StatusBarUtil.setTranslucentForImageView(this, 0, null)
  
    }


    override fun handleMsg(msg: Message?) {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    } 
"""