
    function BtoD() {
    let x = document.getElementById("result").value
    x = parseInt(x,2)
    let bin = x.toString(10);
    document.getElementById("solution").value = bin
	}
		function dis(val)
		{
			document.getElementById("result").value+=val
		}
		
		//function that clear the display
		function clr()
		{
			document.getElementById("result").value = ""
		}
		function BtoH() {
		let x = document.getElementById("result").value
		x = parseInt(x,2)
		let bin = x.toString(16);
		bin = bin.toUpperCase();
		document.getElementById("solution").value = bin
		}

		function BtoO() {
			let x = document.getElementById("result").value
			x = parseInt(x,2)
			let bin = x.toString(8);
			document.getElementById("solution").value = bin
		}
		function DtoB() {
			let x = document.getElementById("result").value
			let bin = 0;
			let rem, i = 1, step = 1;
			while (x != 0) {
				rem = x % 2;
				x = parseInt(x / 2);
				bin = bin + rem * i;
				i = i * 10;
			}
			document.getElementById("solution").value = bin
		}

        function DtoH() {
			let x = document.getElementById("result").value
			x = parseInt(x)
			let octal = x.toString(16);
			octal = octal.toUpperCase();
			document.getElementById("solution").value = octal
		}

        function DtoO() {
			let x = document.getElementById("result").value
			x = parseInt(x)
			let octal = x.toString(8);
			document.getElementById("solution").value = octal
			}

			function HtoB() {
				let x = document.getElementById("result").value
				x = parseInt(x,16)
				let bin = x.toString(2);
				document.getElementById("solution").value = bin
			}
			function HtoD() {
				let x = document.getElementById("result").value
				x = parseInt(x,16)
				let bin = x.toString(10);
				document.getElementById("solution").value = bin
			}
			function HtoO() {
				let x = document.getElementById("result").value
				x = parseInt(x,16)
				let bin = x.toString(8);
				document.getElementById("solution").value = bin
			}
			function OtoB() {
				let x = document.getElementById("result").value
				x = parseInt(x,8)
				let bin = x.toString(2);
				document.getElementById("solution").value = bin
			}

			function OtoD() {
				let x = document.getElementById("result").value
				x = parseInt(x,8)
				let bin = x.toString(10);
				document.getElementById("solution").value = bin
			}
			function OtoH() {
				let x = document.getElementById("result").value
				x = parseInt(x,8)
				let bin = x.toString(16);
				document.getElementById("solution").value = bin
			}











