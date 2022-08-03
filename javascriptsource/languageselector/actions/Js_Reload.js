// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
import "mx-global";
import { Big } from "big.js";

// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * @returns {Promise.<void>}
 */
export async function Js_Reload() {
	// BEGIN USER CODE
	return new Promise(resolve => {
		console.debug('Reloading ...');
		let contentForm = window.mx.ui.getContentForm();
		let reloadObject = {
			page: {
				path: contentForm.path,
				trackId: contentForm.getContext().getTrackId(),
				title: contentForm.title
			},
			cache: window.mx.data.dehydrateCache()
		};
		window.sessionStorage.setItem('mx.reload', JSON.stringify(reloadObject));
		window.mx.reload();
		console.debug('Reloaded succesfully');
    });
	// END USER CODE
}