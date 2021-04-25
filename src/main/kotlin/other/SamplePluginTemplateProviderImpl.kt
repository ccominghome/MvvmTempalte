package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.activity.mvvmActivityTemplate
import other.fragment.mvvmFragmentTemplate

class SamplePluginTemplateProviderImpl : WizardTemplateProvider(){
    override fun getTemplates(): List<Template> = listOf(
            mvvmActivityTemplate,
            mvvmFragmentTemplate

    )

}