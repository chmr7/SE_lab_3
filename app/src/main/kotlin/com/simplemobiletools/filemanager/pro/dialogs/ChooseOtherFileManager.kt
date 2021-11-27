package com.simplemobiletools.filemanager.pro.dialogs

import androidx.appcompat.app.AlertDialog
import com.simplemobiletools.commons.dialogs.ConfirmationDialog
import com.simplemobiletools.commons.extensions.*
import com.simplemobiletools.filemanager.pro.R
import com.simplemobiletools.filemanager.pro.activities.SimpleActivity
import kotlinx.android.synthetic.main.dialog_save_as.view.*
import android.view.View

import com.simplemobiletools.filemanager.pro.helpers.RootHelpers
import kotlinx.android.synthetic.main.dialog_compress_as.view.*
import kotlinx.android.synthetic.main.dialog_create_new.view.*
import java.io.File
import java.io.IOException
import com.simplemobiletools.commons.helpers.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.items_fragment.view.*
import java.util.*
class ChooseOtherFileManager(val activity: SimpleActivity) {
    private val view = activity.layoutInflater.inflate(R.layout.activity_choose_other_file_manager, null)

    init {

        AlertDialog.Builder(activity)
            .setPositiveButton(R.string.ok, null)
            .setNegativeButton(R.string.cancel, null)
            .create().apply { activity.setupDialogStuff(view,this)
            {
                getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(View.OnClickListener { })
                }
            }
        }

}
