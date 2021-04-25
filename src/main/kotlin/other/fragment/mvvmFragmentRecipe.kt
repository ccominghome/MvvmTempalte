package other.fragment
import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.fragment.res.layout.*
import other.fragment.src.app_package.mvvmFragment
import other.fragment.src.app_package.mvvmFragmentViewModel

fun RecipeExecutor.mvvmFragmentRecipe(
        moduleData: ModuleTemplateData,
        fragmentClass: String,
        layoutName: String,
        packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvvmFragment = mvvmFragment(projectData.applicationPackage, fragmentClass,fragmentClass+"ViewModel", layoutName, packageName)
    // 保存Fragment
    save(mvvmFragment, srcOut.resolve("fragment/${fragmentClass}Fragment.${ktOrJavaExt}"))
    open(srcOut.resolve("fragment/${fragmentClass}Fragment.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmFragmentXml(packageName, fragmentClass), resOut.resolve("layout/${layoutName}.xml"))
    open( resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
   // save(mvvmFragmentViewModel(packageName, fragmentClass), srcOut.resolve("viewmodel/${fragmentClass}ViewModel.${ktOrJavaExt}"))
   // open(srcOut.resolve("viewmodel/${fragmentClass}ViewModel.${ktOrJavaExt}"))
}


