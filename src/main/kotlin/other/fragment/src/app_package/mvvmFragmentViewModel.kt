package other.fragment.src.app_package


fun mvvmFragmentViewModel(
        packageName:String,
        fragmentClass:String
)="""
package ${packageName}.viewmodel
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kantai8.sports.App
import com.kantai8.sports.base.BaseViewModel

class ${fragmentClass}ViewModel :  BaseViewModel() {

    private var service = create(?::class.java) 
   
    var data =  MutableLiveData<MutableList<?>>()
    
     fun getData() {
        val disposable = service.?
        
        addSubscribe(disposable)
    }
    
}    
"""