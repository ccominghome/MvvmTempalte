package other.fragment.src.app_package



fun mvvmFragment(
        applicationPackage:String?,
        fragmentClass:String,
        fragmentViewModel:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}.fragment

import android.os.Bundle
import com.kantai8.sports.R
import com.kantai8.sports.base.BaseViewModelFragment
import com.kantai8.sports.common.constant.ID
import ${packageName}.viewmodel.${fragmentViewModel}



class ${fragmentClass}Fragment : BaseViewModelFragment<${fragmentViewModel}>() {

 companion object {
        fun instance(id: Int): ${fragmentClass}Fragment {
            val bundle = Bundle()
            bundle.putInt(ID, id)
            val fragment = ${fragmentClass}Fragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun getIntentData() {
       
    }

    override fun getContentViewId(): Int {
        return R.layout.${layoutName}
    }

    override fun initFragment() {
       
    }


    } 
"""