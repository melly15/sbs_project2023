$('select[data-value]').each(function(index, el) {
	const $el = $(el);
	
<<<<<<< HEAD
	const defaultValue = $(el).attr('data-value').trim();
=======
	const defaultValue = $(el).attr('data-value');
>>>>>>> 8606f94f27bd2148dfcd878b154cca99c7db0a4c
	
	if (defaultValue.length > 0){
		$el.val(defaultValue);
		
	}
})