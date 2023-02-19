<script>
  export let text
  export let onClick
</script>


<button class="text-white font-bold py-2 px-4 rounded w-full"
        style="background: radial-gradient(103.95% 1413.54% at -3.95% 100%, #D33753 0%, #3788D3 0.01%, #3687D1 52.83%, #2D99C7 100%);
        border-radius: 8px;"
        on:click={onClick}>
  {text}
</button>