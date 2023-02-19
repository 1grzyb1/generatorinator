<script>
  export let label
  export let value = ''
  export let disabled = false
</script>

<main>
  <div class="w-full">
    <input class="appearance-none border rounded-md w-full py-2 px-3 text-gray-800 leading-tight focus:outline-none focus:shadow-outline border-gray-300"
           id="{label}" placeholder="{label}" bind:value="{value}" disabled='{disabled}'>
  </div>
</main>