package br.com.biomanual

import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction


abstract class BaseFragmentActivity: BaseActivity() {

    lateinit var container: FrameLayout


    private val fragmentTransaction : FragmentTransaction
        get() = supportFragmentManager.beginTransaction()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    open fun replaceFragment(fragment: SubquestionFragment) {

        val currentFragment = supportFragmentManager.findFragmentById(container.id)

        if(currentFragment== null || currentFragment::class.java.canonicalName
                != fragment::class.java.canonicalName) {

            val fragmentOld = supportFragmentManager.findFragmentByTag(fragment::class.java.canonicalName)
            val ft = fragmentTransaction

            if (fragmentOld== null) {
                ft.replace(container.id, fragment, fragment::class.java.canonicalName)
            } else {
                fragmentOld.arguments = fragment.arguments
                ft.replace(container.id, fragmentOld, fragment::class.java.canonicalName)
            }

            ft.commit()

        }else{
            currentFragment.arguments = fragment.arguments
            currentFragment.onResume()
        }
    }

    open  fun replaceAndBackStackFragment(fragment: SubquestionFragment) {


            val ft = fragmentTransaction


        ft
            .add(container.id, fragment, fragment::class.simpleName)
            ft.addToBackStack(fragment::class.java.canonicalName)
            ft.commit()
    }

}