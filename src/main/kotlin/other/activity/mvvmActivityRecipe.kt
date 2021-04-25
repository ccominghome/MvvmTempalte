package other.activity
import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import other.activity.res.layout.mvvmActivityXml
import other.activity.src.app_package.mvvmActivity


fun RecipeExecutor.mvvmActivityRecipe(
        moduleData: ModuleTemplateData,
        activityClass: String,
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

    val mvvmActivity = mvvmActivity(projectData.applicationPackage, activityClass, layoutName, packageName)
    // 保存Activity
    save(mvvmActivity, srcOut.resolve("activity/${activityClass}Activity.${ktOrJavaExt}"))
    open(srcOut.resolve("activity/${activityClass}Activity.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmActivityXml(packageName, activityClass), resOut.resolve("layout/${layoutName}.xml"))
    open(resOut.resolve("layout/${layoutName}.xml"))

}