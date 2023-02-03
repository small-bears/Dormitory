	/**
 	* 获取当前时间（yyyy-MM-dd hh:mm:ss）
	*/
	function getCurDateTime() {
	        var currentTime = new Date(),
	        year = currentTime.getFullYear(),
	        month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
	        day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
	        hour = currentTime.getHours(),
	        minute = currentTime.getMinutes(),
	        second = currentTime.getSeconds();
	    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
	}

	/**
 	* 获取当前日期（yyyy-MM-dd）
	*/
	function getCurDate() {
	        var currentTime = new Date(),
	        year = currentTime.getFullYear(),
	        month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
	        day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
	    return year + "-" + month + "-" + day;
	}

